    package com.example.user.baisocisscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtInput;
    private TextView tvResult;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnNhan,btnTru,btnCong,btnChia,btnBang,btnC,btnAC,btnCham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtInput = findViewById(R.id.edtInput);
        tvResult = findViewById(R.id.tvResult);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnNhan = findViewById(R.id.btnNhan);
        btnTru = findViewById(R.id.btnTru);
        btnCong = findViewById(R.id.btnCong);
        btnChia = findViewById(R.id.btnChia);

        btnBang = findViewById(R.id.btnBang);
        btnC = findViewById(R.id.btnC);
        btnAC = findViewById(R.id.btnAC);
        btnCham = findViewById(R.id.btnCham);

        setEventClickViews();
    }

        public void setEventClickViews(){
            btn0.setOnClickListener(this);
            btn1.setOnClickListener(this);
            btn2.setOnClickListener(this);
            btn3.setOnClickListener(this);
            btn4.setOnClickListener(this);
            btn5.setOnClickListener(this);
            btn6.setOnClickListener(this);
            btn7.setOnClickListener(this);
            btn8.setOnClickListener(this);
            btn9.setOnClickListener(this);

            btnNhan.setOnClickListener(this);
            btnTru.setOnClickListener(this);
            btnCong.setOnClickListener(this);
            btnChia.setOnClickListener(this);

            btnBang.setOnClickListener(this);
            btnC.setOnClickListener(this);
            btnAC.setOnClickListener(this);
            btnCham.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn0:
                    edtInput.append("0");
                    break;
                case R.id.btn1:
                    edtInput.append("1");
                    break;
                case R.id.btn2:
                    edtInput.append("2");
                    break;
                case R.id.btn3:
                    edtInput.append("3");
                    break;
                case R.id.btn4:
                    edtInput.append("4");
                    break;
                case R.id.btn5:
                    edtInput.append("5");
                    break;
                case R.id.btn6:
                    edtInput.append("6");
                    break;
                case R.id.btn7:
                    edtInput.append("7");
                    break;
                case R.id.btn8:
                    edtInput.append("8");
                    break;
                case R.id.btn9:
                    edtInput.append("9");
                    break;
                case R.id.btnNhan:
                    edtInput.append("*");
                    break;
                case R.id.btnTru:
                    edtInput.append("-");
                    break;
                case R.id.btnCong:
                    edtInput.append("+");
                    break;
                case R.id.btnChia:
                    edtInput.append("/");
                    break;
                case R.id.btnBang:

                    break;
                case R.id.btnC:
                    BaseInputConnection inputConnection = new BaseInputConnection(edtInput,true);
                    inputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                    break;
                case R.id.btnAC:
                    edtInput.setText("");
                    tvResult.setText("");
                    break;
                case R.id.btnCham:
                    edtInput.append(".");
                    break;
            }
        }
    }
