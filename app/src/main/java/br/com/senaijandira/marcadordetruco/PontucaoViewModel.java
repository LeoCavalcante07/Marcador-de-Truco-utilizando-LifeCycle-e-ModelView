package br.com.senaijandira.marcadordetruco;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class PontucaoViewModel extends ViewModel{
    MutableLiveData<Integer> pontuacao = new MutableLiveData<>();
}
