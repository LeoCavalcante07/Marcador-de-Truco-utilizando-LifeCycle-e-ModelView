package br.com.senaijandira.marcadordetruco;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtPontuacao;


    //View Model
    PontucaoViewModel vm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancia ViewModel
        vm = ViewModelProviders.of(this).get(PontucaoViewModel.class);
        txtPontuacao = findViewById(R.id.txtPontuacao);

        if(vm.pontuacao.getValue() == null){
            vm.pontuacao.setValue(0);
        }


        vm.pontuacao.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer valor) {
                txtPontuacao.setText(valor.toString());//faz com que atualize o valor do text toda vez que o valor da variavel pontucao for mudado
            }
        });

    }

    public void adicionar1(View view) {
        vm.pontuacao.setValue(vm.pontuacao.getValue() + 1);
    }

    public void adicionar3(View view) {
        vm.pontuacao.setValue(vm.pontuacao.getValue() + 3);
    }



    public void adicionar6(View view) {
        vm.pontuacao.setValue(vm.pontuacao.getValue() + 6);
    }


    public void adicionar9(View view) {
        vm.pontuacao.setValue(vm.pontuacao.getValue() + 9);
    }

    public void adicionar12(View view) {
        vm.pontuacao.setValue(vm.pontuacao.getValue() + 12);
    }
}
