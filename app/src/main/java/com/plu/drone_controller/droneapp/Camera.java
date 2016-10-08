package com.plu.drone_controller.droneapp;

import java.net.Socket;
import javafx.scene.media.*;
/**
 * Created by Archangel on 4/29/2016.
 */
public class Camera
{
    protected final Socket vidSock;
    //private MediaView;

    public Camera(Socket socket)
    {
        vidSock = socket;
    }

    public boolean receive()
    {
        //image
        return true;
    }

}
