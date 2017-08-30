package com.mulesoft.support;

import org.mule.api.MuleEvent;

import com.mulesoft.mule.cache.responsegenerator.ResponseGenerator;

public class PayloadResponseGenerator implements ResponseGenerator
{
  @Override
  public MuleEvent create(MuleEvent request, MuleEvent cachedResponse)
  {
    // we only need to set the payload
    request.getMessage().setPayload(cachedResponse.getMessage().getPayload());

    return request;
  }
}