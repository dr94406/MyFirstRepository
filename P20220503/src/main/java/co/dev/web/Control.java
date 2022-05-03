package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Control {
	public void execute(HttpServletRequest request, HttpServletResponse reponse)throws ServletException, IOException; // 추상메소드 선언.

}
