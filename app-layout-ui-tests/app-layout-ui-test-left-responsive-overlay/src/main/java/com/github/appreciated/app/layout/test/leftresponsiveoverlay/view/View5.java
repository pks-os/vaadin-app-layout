package com.github.appreciated.app.layout.test.leftresponsiveoverlay.view;

import com.github.appreciated.app.layout.test.leftresponsiveoverlay.LeftResponsiveOverlayBehaviourView;
import com.github.appreciated.app.layout.test.view.ExampleView;
import com.vaadin.flow.router.Route;

@Route(value = "view5", layout = LeftResponsiveOverlayBehaviourView.class)
// an empty view name will also be the default view
public class View5 extends ExampleView {
    @Override
    protected String getViewName() {
        return getClass().getName();
    }
}
