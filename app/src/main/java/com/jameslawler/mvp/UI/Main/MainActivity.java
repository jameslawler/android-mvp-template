package com.jameslawler.mvp.UI.Main;

import android.os.Bundle;
import android.widget.TextView;

import com.google.inject.Inject;
import com.jameslawler.mvp.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;

@ContentView(R.layout.activity_main)
public class MainActivity
        extends RoboActivity
        implements IMainView {

    @Inject
    protected MainPresenter presenter;

    @Bind(R.id.text_input)
    protected TextView input;

    @Bind(R.id.text_output)
    protected TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.presenter.bindView(this);
    }

    @OnClick(R.id.button_action)
    protected void onButtonClick() {
        String inputValue = this.input.getText().toString();

        this.presenter.onSay(inputValue);
    }

    @Override
    public void showOutput(String output) {
        this.output.setText(output);
    }
}
