//  Copyright 2015 Google Inc.
//  
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//  
//  http://www.apache.org/licenses/LICENSE-2.0
//  
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.

package com.google.gct.tutorial;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloBrowserServlet extends HttpServlet {
  
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String userAgent = request.getHeader("UserAgent");
    String displayName = "Browser";

    if (userAgent != null) {
      if (userAgent.contains("Mozilla")) {
        displayName = "Firefox"; 
      } else if (userAgent.contains("Explorer")) {
        displayName = "Internet Explorer"; 
      } else if (userAgent.contains("Safari")) {
        displayName = "Safari"; 
      } else if (userAgent.contains("Chrome")) {
        displayName = "Chrome"; 
      } else if (userAgent.contains("Opera")) {
        displayName = "Opera"; 
      } else {
        displayName = userAgent; 
      }
    }
    
    response.setContentType("text/html");
    PrintWriter writer = response.getWriter();

    writer.println("<html><body><h1>");
    writer.println("Hello " + displayName);
    writer.println("</h1></body></html>");
  }
  
}
