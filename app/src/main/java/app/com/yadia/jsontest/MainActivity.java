package app.com.yadia.jsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = (TextView) findViewById(R.id.textView1);
        String strJson="
        {
            \"Employee\" :[
            {
                \"id\":\"01\",
                \"name\":\"Gopal Varma\",
                \"salary\":\"500000\"
            },
            {
                \"id\":\"02\",
                \"name\":\"Sairamkrishna\",
                \"salary\":\"500000\"
            },
            {
                \"id\":\"03\",
                \"name\":\"Sathish kallakuri\",
                \"salary\":\"600000\"
            }
            ]
        }";

        String data = "";
        try{
            JSONObject jsonRootObject = new JSONObject(strJson);
            
        }

    }
}
