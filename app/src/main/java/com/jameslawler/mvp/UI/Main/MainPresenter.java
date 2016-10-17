package com.jameslawler.mvp.UI.Main;

public class MainPresenter {
    private IMainView view;

    public void bindView(IMainView view) {
        this.view = view;
    }

    public void onSay(String input) {
        this.view.showOutput(input + " (added)");
    }
}
