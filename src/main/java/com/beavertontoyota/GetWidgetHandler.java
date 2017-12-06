package com.beavertontoyota;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.beavertontoyota.models.Widgets;
import com.beavertontoyota.models.WidgetsRequest;

public class GetWidgetHandler implements RequestHandler<WidgetsRequest, Widgets> {

    public Widgets handleRequest(WidgetsRequest widgetsRequest, Context context) {
        return new Widgets(widgetsRequest.getId(), "My Widget " + widgetsRequest.getId());
    }
}