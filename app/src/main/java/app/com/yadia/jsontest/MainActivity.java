package app.com.yadia.jsontest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = (TextView) findViewById(R.id.textView1);
        String strJson=" { " +
                "Employee\" :[
            {
                "id\":\"01\",
                "name\":\"Gopal Varma\",
                "salary\":\"500000\"
            },
            {
                "id\":\"02\",
                "name\":\"Sairamkrishna\",
                "salary\":\"500000\"
            },
            {
                "id\":\"03\",
                "name\":\"Sathish kallakuri\",
                "salary\":\"600000\"
            }
            ]
        }";

        String data = "";
        try{
            JSONObject jsonRootObject = new JSONObject(strJson);

            //get the insance of jsonarray that contains jsonObjects
            JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");

            //iterate the jsonArray and print the info of JsonObjects
            for (int i = 0; i < jsonArray.length(); i++){\
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = Integer.parseInt(jsonRootObject.optString("id").toString());
                String name = jsonObject.optString("name").toString();
                float salaray = Float.parseFloat(jsonObject.optString("salary").toString());

                data += "Node" + i + " \n id= " + id + " \n Name= " + "name " + " \n Salarary=" + salaray
                        + " \n ";
            }
            output.setText(data);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
