package com.google.gct.tutorial;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class HelloBrowserServletTest {

  private HelloBrowserServlet servlet = new HelloBrowserServlet();

  @Test
  public void testChrome() throws IOException {
    StubHttpServletRequest request = new StubHttpServletRequest();
    request.setHeader("UserAgent", "Chrome");
    SpyHttpServletResponse response = new SpyHttpServletResponse();
    servlet.doGet(request, response);
    Assert.assertTrue(response.getBody().contains("Hello Chrome"));
  }

}