package com.security.filters;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.security.service.JwtService;
import com.security.service.MyUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter
{
	@Autowired
	private JwtService jwtService;
	
	
 	@Autowired
 	UserDetailsService userDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException 
	{
	String username=null;
		 
	String token=null;
	
	String authHeader=request.getHeader("Authorization");
	if(authHeader!=null &&  authHeader.startsWith("Bearer"))
	{
		token=authHeader.substring(7);
		username=jwtService.extractUsername(token);		
	}
		
	if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null)
	{
		UserDetails userDetails=userDetailsService.loadUserByUsername(username);
        if(jwtService.validateToken(token, userDetails))
        {
        	UsernamePasswordAuthenticationToken authenticationToken= new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        	authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        	SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }
	}
	filterChain.doFilter(request, response);
	}

}
