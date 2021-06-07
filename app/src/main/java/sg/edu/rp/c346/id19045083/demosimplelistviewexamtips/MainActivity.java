package sg.edu.rp.c346.id19045083.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] examTipsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        examTipsArray = new String[5];
        examTipsArray[0] = getString(R.string.examTip1);
        examTipsArray[1] = getString(R.string.examTip2);
        examTipsArray[2] = getString(R.string.examTip3);
        examTipsArray[3] = getString(R.string.examTip4);
        examTipsArray[4] = getString(R.string.examTip5);

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, examTipsArray);
        lvExamTips.setAdapter(adapter);

    }
}