package com.solvd.adapter;

import com.solvd.entities.Proyect;

public class AdapterBudgetImpl implements IAdapterBudget {
    
    private Proyect proyect;

    @Override
    public double getAmount() {
        return proyect.getBudget();
    }

    @Override
    public void setAmount(double amount) {
        proyect.setBudget(amount);
    }
    
}
