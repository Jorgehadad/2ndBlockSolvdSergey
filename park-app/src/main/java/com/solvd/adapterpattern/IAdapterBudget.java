package com.solvd.adapterpattern;

import com.solvd.entities.Proyect;

public interface IAdapterBudget extends ISetAmount {

    Proyect proyect = new Proyect();

    @Override
    public double getAmount();

    @Override
    public void setAmount(double amount);
    


}
