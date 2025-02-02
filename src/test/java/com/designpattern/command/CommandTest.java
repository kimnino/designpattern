package com.designpattern.command;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class CommandTest {

    @Test
    public void test() {

        PushRemoteControl remote = new PushRemoteControl();
        Push push = new Push();
        PushCommand pushCommand = new PushCommand(push);

        remote.setCommand(pushCommand);
        remote.buttonWasPushed();
    }
}
