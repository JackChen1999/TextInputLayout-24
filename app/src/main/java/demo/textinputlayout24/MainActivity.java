package demo.textinputlayout24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import demo.design.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout textInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputLayout = (TextInputLayout) findViewById(R.id.inputlayout);
        textInputLayout.setCounterEnabled(true);
        textInputLayout.setCounterMaxLength(20);

        textInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                textInputLayout.setError("error "+s.length());
//                if(s.length() % 2 == 0)
//                    textInputLayout.setErrorEnabled(false);
//                else
//                    textInputLayout.setErrorEnabled(false);

            }
        });
    }
}
