package com.chachae.design.behaviour.chain_of_responsibility;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 17:49
 */
public class ResponseHandler extends AbstractHandler implements Handler {

  @Override
  public void operator() {
    System.out.println("响应");
    if (getHandler() != null) {
      getHandler().operator();
    }
  }
}
