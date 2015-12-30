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

  @Test
  public void testSafari() throws IOException {
    StubHttpServletRequest request = new StubHttpServletRequest();
    request.setHeader("UserAgent", "Safari");
    SpyHttpServletResponse response = new SpyHttpServletResponse();
    servlet.doGet(request, response);
    Assert.assertTrue(response.getBody().contains("Hello Safari"));
  }

  @Test
  public void testFirefox() throws IOException {
    StubHttpServletRequest request = new StubHttpServletRequest();
    request.setHeader("UserAgent", "Firefox");
    SpyHttpServletResponse response = new SpyHttpServletResponse();
    servlet.doGet(request, response);
    Assert.assertTrue(response.getBody().contains("Hello Firefox"));
  }

}