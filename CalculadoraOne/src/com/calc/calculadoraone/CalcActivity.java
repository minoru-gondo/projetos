package com.calc.calculadoraone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends Activity {
	private double num1, num2, numResultado;
	private EditText txtNum1, txtNum2;
	private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnApagar;
    private TextView txtResultado;
    
       
    public void onBackPressed( ) {
    	AlertDialog.Builder alerta = new AlertDialog.Builder(CalcActivity.this);
		alerta.setTitle("Sair do Programa");
		alerta.setMessage("Deseja Sair?");
		alerta.setPositiveButton("OK" , new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int arg1) {
				System.exit(0);
			}
		});
		alerta.setNeutralButton("Cancelar", null);
		alerta.show();
    	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc);
		
		txtNum1 = (EditText) findViewById(R.id.campo1);
		txtNum2 = (EditText) findViewById(R.id.campo2);
		txtResultado = (TextView) findViewById(R.id.campo3);
		
		
		
		btnSomar = (Button) findViewById(R.id.btnSoma);
		btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
		btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
		btnDividir = (Button) findViewById(R.id.btnDividir);
		btnApagar = (Button) findViewById(R.id.btnApagar);


		btnSomar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
				num1 = Double.parseDouble(txtNum1.getText().toString());
				num2 = Double.parseDouble(txtNum2.getText().toString());
				numResultado = num1 + num2;
				txtResultado.setText(String.valueOf(numResultado));
				txtResultado.setVisibility(1);
				} 
				catch(Exception vazio) {
					vazio.printStackTrace();
					AlertDialog.Builder alerta = new AlertDialog.Builder(CalcActivity.this);
					alerta.setTitle("Cuidado, Campo Vazio!!!");
					alerta.setMessage("Digite os Valores: ");
					alerta.setNeutralButton("OK" , null);
					alerta.show();
				}
			}
		}); // Fim do btnSomar
		
		  btnSubtrair.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
			    num1 = Double.parseDouble(txtNum1.getText().toString());
				num2 = Double.parseDouble(txtNum2.getText().toString());
				numResultado = num1 - num2;
				txtResultado.setText(String.valueOf(numResultado));
				txtResultado.setVisibility(1);
				} 
				catch(Exception vazio) {
					vazio.printStackTrace();
					AlertDialog.Builder alerta = new AlertDialog.Builder(CalcActivity.this);
					alerta.setTitle("Cuidado, Campo Vazio!!!");
					alerta.setMessage("Digite os Valores: ");
					alerta.setNeutralButton("OK" , null);
					alerta.show();
				}
			}
		}); // Fim do btnSubtrair
		
		btnMultiplicar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
				num1 = Double.parseDouble(txtNum1.getText().toString());
				num2 = Double.parseDouble(txtNum2.getText().toString());
				numResultado = num1 * num2;
				txtResultado.setText(String.valueOf(numResultado));
				txtResultado.setVisibility(1);
				} 
				catch(Exception vazio) {
					vazio.printStackTrace();
					AlertDialog.Builder alerta = new AlertDialog.Builder(CalcActivity.this);
					alerta.setTitle("Cuidado, Campo Vazio!!!");
					alerta.setMessage("Digite os Valores: ");
					alerta.setNeutralButton("OK" , null);
					alerta.show();
				}
			}
		}); // Fim do btnMultiplicar
		
		btnDividir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
				num1 = Double.parseDouble(txtNum1.getText().toString());
				num2 = Double.parseDouble(txtNum2.getText().toString());
				numResultado = num1 / num2;
				txtResultado.setText(String.valueOf(numResultado));
				txtResultado.setVisibility(1);
				} 
				catch(Exception vazio) {
					vazio.printStackTrace();
					AlertDialog.Builder alerta = new AlertDialog.Builder(CalcActivity.this);
					alerta.setTitle("Cuidado, Campo Vazio!!!");
					alerta.setMessage("Digite os Valores: ");
					alerta.setNeutralButton("OK" , null);
					alerta.show();
				}
			}
		}); // Fim do btnDividir 
		
		btnApagar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtNum1.setText(" ");
				txtNum2.setText(" ");
				txtResultado.setText(" ");
				txtNum1.requestFocus();
				txtResultado.setVisibility(1);
			}
		}); // Fim do btnApagar
		
		
		
	}
	
}

