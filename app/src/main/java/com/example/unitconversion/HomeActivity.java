package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Spinner unitConversionSpinner;
    public Spinner fromUnitConversionSpinner;
    public Spinner toUnitConversionSpinner;
    private String[] units = {};
    private Button button;
    private EditText editText;
    public TextView resultView;
    public String fromUnit;
    public String toUnit;
    private static HomeActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewTheSelectedItems();
    }

    public void viewTheSelectedItems() {
        unitConversionSpinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Conversion, R.layout.layout_spinner_item);
        adapter.setDropDownViewResource(R.layout.layout_spinner_item);
        unitConversionSpinner.setAdapter(adapter);
        unitConversionSpinner.setOnItemSelectedListener(this);

        fromUnitConversionSpinner = findViewById(R.id.spinnerFrom);

        toUnitConversionSpinner = findViewById(R.id.spinnerTo);

        editText = findViewById(R.id.editTextTextPersonName);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        resultView = findViewById(R.id.editTextTextPersonName3);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedType = parent.getItemAtPosition(position).toString();

        if (view.getParent() == unitConversionSpinner) {

            switch (selectedType) {
                case "Select a conversion Type":
                    units = getResources().getStringArray(R.array.selectAConversionType);
//                    fromUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.selectAConversionType)));
//                    toUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.selectAConversionType)));
                    break;
                case "Length":
                    units = getResources().getStringArray(R.array.LengthUnits);
//                    fromUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.LengthUnits)));
//                    toUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.LengthUnits)));
                    break;
                case "Mass":
                    units = getResources().getStringArray(R.array.MassUnits);
//                    fromUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.MassUnits)));
//                    toUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.MassUnits)));
                    break;
                case "Temperature":
                    units = getResources().getStringArray(R.array.TemperatureUnits);
//                    fromUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.TemperatureUnits)));
//                    toUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.TemperatureUnits)));
                    break;
                case "Volume":
                    units = getResources().getStringArray(R.array.VolumeUnits);
//                    fromUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.VolumeUnits)));
//                    toUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, getResources().getStringArray(R.array.VolumeUnits)));
                    break;
            }
          Log.e("balarama","units is " +units.length);
          Toast.makeText(parent.getContext(),selectedType, Toast.LENGTH_SHORT).show();
          fromUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, units));
          toUnitConversionSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_spinner_item, units));

            fromUnit = (String)(fromUnitConversionSpinner.getItemAtPosition(0).toString());
            toUnit = (String)(toUnitConversionSpinner.getItemAtPosition(0).toString());

            //reset the result
            //resultView.setText("");
        } else if(view.getParent() == fromUnitConversionSpinner){
            fromUnit = (String)(fromUnitConversionSpinner.getSelectedItem().toString());
        }

        else if(view.getParent() == toUnitConversionSpinner){
            toUnit = (String)(toUnitConversionSpinner.getSelectedItem().toString());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    @Override
    public void onClick(View view) {
        Context context = new Context(new LengthUnits());
        if (view == button) {
            if(!editText.getText().toString().equals("")){
                double in = Double.parseDouble(editText.getText().toString());
                double result = context.executeStrategy(fromUnit, toUnit, in);
                resultView.setText(Double.toString(result));
                Log.e("Balarama", "Result is " +result);
            }
            else {
                resultView.setText("");
            }
        }

    }

    public static HomeActivity getInstance() {
        return instance;
    }
}