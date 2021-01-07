package com.itqpleyva.abstractfactorypattern.factories;

import com.itqpleyva.abstractfactorypattern.interfaces.Button;
import com.itqpleyva.abstractfactorypattern.interfaces.Checkbox;

public interface GuiFactory {

    Button createButton();
    Checkbox createCheckbox();
}