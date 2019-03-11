package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Declaring the EditText of Output Result
    EditText inputOutputResult;

    //Declaring the TextView of Input
    TextView input;

    //Declaring boolean values for arithmetic calculation operations
    boolean percentageBoolValue,divisionBoolvalue,subtractBoolValue, sumBoolValue, multiplicationBoolValue ;

    //Declaring two decimal values for arithmetic calculations
    double firstDecimal, secondDecimal;

    //Declaring Buttons of the calculator
    Button doubleZero;
    Button tripleZero;
    Button singleZero;
    Button one;
    Button percentage;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button division;
    Button product;
    Button clearAll;
    Button equal;
    Button dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Retrieving instances of Buttons and EditText
        inputOutputResult = (EditText)findViewById(R.id.inputOutput);
        input = (TextView)findViewById(R.id.input);
        doubleZero =(Button)findViewById(R.id.doubleZero);
        tripleZero =(Button)findViewById(R.id.tripleZero);
        singleZero =(Button)findViewById(R.id.singleZero);
        one =(Button)findViewById(R.id.oneBtn);
        percentage=(Button) findViewById(R.id.percentageBtn);
        two =(Button)findViewById(R.id.twoBtn);
        three =(Button)findViewById(R.id.threeBtn);
        four =(Button)findViewById(R.id.fourBtn);
        five =(Button)findViewById(R.id.fiveBtn);
        six =(Button)findViewById(R.id.sixBtn);
        seven =(Button)findViewById(R.id.sevenBtn);
        eight =(Button)findViewById(R.id.eightBtn);
        nine =(Button)findViewById(R.id.nineBtn);
        plus =(Button)findViewById(R.id.addBtn);
        minus =(Button)findViewById(R.id.subtractBtn);
        product =(Button)findViewById(R.id.multiplyBtn);
        division =(Button)findViewById(R.id.divisionBtn);
        clearAll =(Button)findViewById(R.id.clearBtn);
        equal =(Button)findViewById(R.id.equalBtn);
        dot =(Button)findViewById(R.id.dotBtn);

        //set onClickListener to equal button to get the results after the calculations
        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                secondDecimal = Double.parseDouble(inputOutputResult.getText() + "");

                //Add two values, if the boolean value is true
                if (sumBoolValue == true)
                {
                    input.setText(firstDecimal +"+" +secondDecimal);
                    inputOutputResult.setText(firstDecimal + secondDecimal + "");
                    sumBoolValue = false;
                }

                //Divide second value by 100 and multiply it by first value, if the boolean value is true
                if (percentageBoolValue == true)
                {
                    input.setText(firstDecimal +"%" +secondDecimal);
                    inputOutputResult.setText(firstDecimal *( secondDecimal)/100 + "");
                    percentageBoolValue = false;
                }

                //Subtract two values, if the boolean value is true
                if (subtractBoolValue == true)
                {
                    input.setText(firstDecimal +"-" +secondDecimal);
                    inputOutputResult.setText(firstDecimal - secondDecimal + "");
                    subtractBoolValue = false;
                }

                //Multiply two values, if the boolean value is true
                if (multiplicationBoolValue == true)
                {
                    input.setText(firstDecimal +"x" +secondDecimal);
                    inputOutputResult.setText(firstDecimal * secondDecimal + "");
                    multiplicationBoolValue = false;
                }

                //Divide two values, if the boolean value is true
                if (divisionBoolvalue == true)
                {
                    input.setText(firstDecimal +"/" +secondDecimal);
                    inputOutputResult.setText(firstDecimal / secondDecimal + "");
                    divisionBoolvalue = false;
                }

            }
        });

        //Setting onClickListener to percentage button
        percentage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstDecimal = Float.parseFloat(inputOutputResult.getText() + "");
                //set subtraction function as true
                percentageBoolValue = true;
                inputOutputResult.setText(null);
            }
        });

        //Setting onClickListener to plus button
        plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Implementing condition to add two values
                if (inputOutputResult == null)
                {
                    inputOutputResult.setText("");
                }
                //If the inputOutputResult is not null, set addition function as true
                else
                {
                    firstDecimal = Double.parseDouble(inputOutputResult.getText() + "");
                    sumBoolValue = true;
                    inputOutputResult.setText(null);
                }
            }
        });



        //Setting onClickListener to minus button
        minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstDecimal = Float.parseFloat(inputOutputResult.getText() + "");
                //set subtraction function as true
                subtractBoolValue = true;
                inputOutputResult.setText(null);
            }
        });

        //Setting onClickListener to multiplication button
        product.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstDecimal = Double.parseDouble(inputOutputResult.getText() + "");
                //set multiplication function as true
                multiplicationBoolValue = true;
                inputOutputResult.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                firstDecimal = Double.parseDouble(inputOutputResult.getText() + "");
                //set division function as true
                divisionBoolvalue = true;
                inputOutputResult.setText(null);
            }
        });


        //Setting onClickListener to retrieve the text on inputOutputResult as "00"
        doubleZero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                inputOutputResult.setText(inputOutputResult.getText() + "00");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "000"
        tripleZero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "000");
            }
        });

        //Setting onClickListener to clear the inputOutputResult value
        clearAll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText("");
                input.setText(" ");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "1"
        one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText()+"1");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "2"
        two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "2");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "3"
        three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "3");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "4"
        four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "4");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "5"
        five.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "5");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "6"
        six.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "6");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "7"
        seven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "7");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "8"
        eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "8");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "9"
        nine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "9");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "0"
        singleZero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + "0");
            }
        });

        //Setting onClickListener to retrieve the text on inputOutputResult as "."
        dot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                inputOutputResult.setText(inputOutputResult.getText() + ".");
            }
        });

    }
}

