package reader.jiyun.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

linearLayout= (LinearLayout) findViewById(R.id.ll);
initBarChart1();

    }
    private void initBarChart1() {
        String[] xLabel = {"0", "1", "2", "3"
             };
        String[] yLabel = {"0", "100", "200", "300", "400", "500", "600", "700", "800", "900"};
        int[] data1 = {300, 500, 550, 500};
        List<int[]> data = new ArrayList<>();
        data.add(data1);
        List<Integer> color = new ArrayList<>();
        color.add(R.color.colorAccent);
        color.add(R.color.colorAccent);
        color.add(R.color.colorAccent);
       linearLayout .addView(new CustomBarChart(this, xLabel, yLabel, data, color));
    }

}
