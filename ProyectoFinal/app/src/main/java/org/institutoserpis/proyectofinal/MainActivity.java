package org.institutoserpis.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    boolean punto=false;
    boolean restar=false;
    boolean sumar=false;
    boolean multiplicar=false;
    boolean dividir=false;
    boolean pi=false;
    boolean igual=false;
    boolean raiz=false;
    boolean pareabrir=false;
    boolean parecerrar=false;
    boolean log=false;
    boolean sen=false;
    boolean cos=false;
    boolean tag=false;
    boolean porcentaje=false;
    boolean exponente=false;

    Double[] numeros=new Double[20];
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Numeros
        Button cero=(Button)findViewById(R.id.num0);
        cero.setOnClickListener(this);
        Button uno=(Button)findViewById(R.id.num1);
        uno.setOnClickListener(this);
        Button dos=(Button)findViewById(R.id.num2);
        dos.setOnClickListener(this);
        Button tres=(Button)findViewById(R.id.num3);
        tres.setOnClickListener(this);
        Button cuatro=(Button)findViewById(R.id.num4);
        cuatro.setOnClickListener(this);
        Button cinco=(Button)findViewById(R.id.num5);
        cinco.setOnClickListener(this);
        Button seis=(Button)findViewById(R.id.num6);
        seis.setOnClickListener(this);
        Button siete=(Button)findViewById(R.id.num7);
        siete.setOnClickListener(this);
        Button ocho=(Button)findViewById(R.id.num8);
        ocho.setOnClickListener(this);
        Button nueve=(Button)findViewById(R.id.num9);
        nueve.setOnClickListener(this);

        //Signos
        Button punto=(Button)findViewById(R.id.decimal);
        punto.setOnClickListener(this);
        Button pi=(Button)findViewById(R.id.pi);
        pi.setOnClickListener(this);
        Button igual=(Button)findViewById(R.id.Igual);
        igual.setOnClickListener(this);
        Button sumar=(Button)findViewById(R.id.sumar);
        sumar.setOnClickListener(this);
        Button restar=(Button)findViewById(R.id.restar);
        restar.setOnClickListener(this);
        Button multiplicar=(Button)findViewById(R.id.multiplicar);
        multiplicar.setOnClickListener(this);
        Button dividir=(Button)findViewById(R.id.dividir);
        dividir.setOnClickListener(this);

        Button pareabrir=(Button)findViewById(R.id.pareabrir);
        pareabrir.setOnClickListener(this);
        Button parecerrar=(Button)findViewById(R.id.parecerrar);
        parecerrar.setOnClickListener(this);
        Button raiz=(Button)findViewById(R.id.raiz);
        raiz.setOnClickListener(this);
        Button log=(Button)findViewById(R.id.logaritmo);
        log.setOnClickListener(this);
        Button sen=(Button)findViewById(R.id.seno);
        sen.setOnClickListener(this);
        Button cos=(Button)findViewById(R.id.coseno);
        cos.setOnClickListener(this);
        Button tag=(Button)findViewById(R.id.tangente);
        tag.setOnClickListener(this);

        Button porcentaje=(Button)findViewById(R.id.porcentaje);
        porcentaje.setOnClickListener(this);
        Button exponente=(Button)findViewById(R.id.exponente);
        exponente.setOnClickListener(this);

        Button del=(Button)findViewById(R.id.delete);
        del.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView pantalla=(TextView)findViewById(R.id.resultado);
        int seleccion=v.getId();
        String a=pantalla.getText().toString();
        try{

            switch (seleccion){
                case R.id.num0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.num1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.num2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.num3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.num4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.num5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.num6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.num7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.num8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.num9:
                    pantalla.setText(a+"9");
                    break;

                case R.id.decimal:
                    if(punto==false) {
                        pantalla.setText(a + ".");
                        punto = true;
                    }else{return;}
                break;
                case R.id.pareabrir:
                    if(pareabrir==false) {
                        pantalla.setText(a + "(");
                        pareabrir = true;
                    }else{return;}
                    break;
                case R.id.parecerrar:
                    if(parecerrar==false) {
                        pantalla.setText(a + ")");
                        parecerrar = true;
                    }else{return;}
                    break;

                case R.id.restar:
                    restar=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.sumar:
                    sumar=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.multiplicar:
                    multiplicar=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.dividir:
                    dividir=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;

                case R.id.exponente:
                    exponente=true;
                    numeros[0]=Double.parseDouble(a);
                    numeros[1]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.pow(numeros[0], numeros[1]);
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.raiz:
                    raiz=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sqrt(numeros[0]);
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;

                case R.id.tangente:
                    tag=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.tan(numeros[0]*Math.PI/180);
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.coseno:
                    cos=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.cos(numeros[0]*Math.PI/180);
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.seno:
                    sen=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sin(numeros[0]*Math.PI/180);
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;

                case R.id.logaritmo:
                    log=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.log(numeros[0]);
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.pi:
                    pi=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.PI*numeros[0];
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
                case R.id.porcentaje:
                    porcentaje=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=numeros[0]*100/numeros[1];
                    pantalla.setText(String.valueOf(resultado));
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;

                case R.id.Igual:
                    numeros[1]=Double.parseDouble(a);
                    if (restar==true){
                        resultado=numeros[0]-numeros[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (sumar==true){
                        resultado=numeros[0]+numeros[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (dividir==true){
                        resultado=numeros[0]/numeros[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (multiplicar==true){
                        resultado=numeros[0] * numeros[1];
                        pantalla.setText(String.valueOf(resultado));
                    }
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    restar=false;
                    sumar=false;
                    dividir=false;
                    multiplicar=false;
                    pi=false;
                    porcentaje=false;
                    log=false;
                    cos=false;
                    sen=false;
                    tag=false;
                    exponente=false;
                    igual=false;
                    raiz=false;
                    break;
                case R.id.delete:
                    pantalla.setText("");
                    punto=false;
                    pareabrir=false;
                    parecerrar=false;
                    break;
            }

        }catch (Exception e){
            pantalla.setText("Error");
        }
    }
}
