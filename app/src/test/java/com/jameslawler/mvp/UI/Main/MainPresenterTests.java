package com.jameslawler.mvp.UI.Main;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainPresenterTests {
    private IMainView mainView = mock(IMainView.class);
    private MainPresenter mainPresenter;

    @Before
    public void setup() {
        this.mainPresenter = new MainPresenter();
        this.mainPresenter.bindView(this.mainView);
    }

    @Test
    public void givenButton_whenClicked_ShouldChangeInputToOutput() {
        // arrange
        String input = "input";
        String expectedOutput = "input (added)";

        // act
        this.mainPresenter.onSay(input);

        // assert
        verify(this.mainView).showOutput(expectedOutput);
    }
}
