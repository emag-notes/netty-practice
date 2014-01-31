package org.emamotor.netty.practice;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * @author tanabe
 */
public class EchoServerHandler extends SimpleChannelHandler {

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent event) {
        String msg = (String) event.getMessage();
        ctx.getChannel().write(msg);
    }

}
