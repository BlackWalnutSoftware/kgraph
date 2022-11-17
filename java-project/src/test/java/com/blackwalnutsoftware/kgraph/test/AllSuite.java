package com.blackwalnutsoftware.kgraph.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.blackwalnutsoftware.kgraph.engine.ElementFactoryTest;
import com.blackwalnutsoftware.kgraph.engine.KnowledgeGraphTest2;
import com.blackwalnutsoftware.kgraph.test.engine.KnowledgeGraphTest;
import com.blackwalnutsoftware.kgraph.test.loader.StockDataLoaderTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({ KnowledgeGraphTest.class, KnowledgeGraphTest2.class, ElementFactoryTest.class, StockDataLoaderTest.class })

public class AllSuite {
}