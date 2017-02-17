package lv.id.tomsteteris.businesscard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView areaSize = (TextView) findViewById(R.id.area_size);
        areaSize.setText(Html.fromHtml(getText(R.string.area_size).toString()));
    }
}
