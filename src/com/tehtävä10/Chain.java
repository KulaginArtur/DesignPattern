package com.tehtävä10;

public interface Chain {

    void setNextChain(Chain nextChain);

    void calculate(Numbers request);

}
