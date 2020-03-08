package com.techtown.toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        토스트
        Button button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "위치가 바뀐 토스트",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.LEFT,200,200);
                toast.show();
            }

        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toastborder,(ViewGroup)findViewById(R.id.toast_layout_root));

                TextView text = (TextView)layout.findViewById(R.id.text);
                text.setText("모양을 바꾼 토스트");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0,-100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);

                toast.show();
            }
        });
//스낵바
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "스낵바입니다.",Snackbar.LENGTH_LONG);
                snackbar.show();

            }

        });

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });
    }
//Dialog 알림창
    TextView textView2= (TextView)findViewById(R.id.textView2);

    public void showMessage(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("안내");
        builder.setMessage("종료하시겠습니까?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        //예를 눌렀을 때
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Snackbar snackbar = Snackbar.make(textView2, "예 버튼이 눌렸습니다",Snackbar.LENGTH_LONG);
                snackbar.show();
            } //스낵바 띄움
        }); //아니오
        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
            @Override //스낵바
            public void onClick(DialogInterface dialog, int which) {
                Snackbar snackbar = Snackbar.make(textView2, "예 버튼이 눌렸습니다",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
        //주의!!
        AlertDialog dialog= builder.create();
        dialog.show();
    }
}
