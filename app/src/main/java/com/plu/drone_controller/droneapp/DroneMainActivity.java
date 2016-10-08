package com.plu.drone_controller.droneapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DroneMainActivity extends AppCompatActivity {

    Button forwardBtn;
    Button backBtn;
    Button leftBtn;
    Button rightBtn;
    Button upBtn;
    Button downBtn;
    Button acwBtn;
    Button cwBtn;
    Button onBtn;
    Button landBtn;
    Button offBtn;

    private Socket socket;
    private String msg;
    private BufferedWriter out;
    private OutputStream outStream;

    private static final int SERVERPORT = 23;
    //private static final String SERVER_IP = "192.168.1.107";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drone_main);
        final AsyncAction asyncA = new AsyncAction();
        asyncA.execute();

        forwardBtn = (Button)findViewById(R.id.forwardButton);
        backBtn = (Button)findViewById(R.id.backButton);
        leftBtn = (Button)findViewById(R.id.leftButton);
        rightBtn = (Button)findViewById(R.id.rightButton);
        upBtn = (Button)findViewById(R.id.upButton);
        downBtn = (Button)findViewById(R.id.downButton);
        acwBtn = (Button)findViewById(R.id.acwButton);
        cwBtn = (Button)findViewById(R.id.cwButton);
        onBtn = (Button)findViewById(R.id.onButton);
        landBtn = (Button)findViewById(R.id.landButton);
        offBtn = (Button)findViewById(R.id.offButton);

        forwardBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "F";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        backBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "B";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        leftBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "L";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        rightBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "R";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        upBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "U";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        downBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "D";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        acwBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "A";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        cwBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        msg = "C";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    case MotionEvent.ACTION_UP:
                        msg = "S";
                        try {
                            asyncA.writeOut(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                }
                return false;
            }
        });

        onBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "N";
                try {
                    asyncA.writeOut(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        landBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "X";
                try {
                    asyncA.writeOut(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "O";
                try {
                    asyncA.writeOut(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }


    //http://stackoverflow.com/questions/9413625/android-android-os-networkonmainthreadexception
    //http://stackoverflow.com/questions/10602991/android-asynchronous-sockets-android-app-as-server-waiting-for-clients-to-conne
    //http://android-developers.blogspot.in/2009/05/painless-threading.html

    private class AsyncAction extends AsyncTask<String, Void, String> {
        protected String doInBackground(String... args) {
            //InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
            try {
                socket = new Socket("192.168.1.107", SERVERPORT);
                //socket = new Socket("192.168.1.19", 8080);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outStream = socket.getOutputStream();
                out = new BufferedWriter( new OutputStreamWriter(outStream));
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            return null;
        }
        public void writeOut(String msg) throws IOException {
            out.write(msg);
            out.flush();
        }
    }

}