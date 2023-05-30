package suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.AgentieTurismTest;
import tests.PachetTuristicTest;
import tests.PachetTuristicVarstaTest;

@RunWith(Suite.class)
@SelectClasses({AgentieTurismTest.class, PachetTuristicTest.class, PachetTuristicVarstaTest.class})

public class SuitaCompleta {

}



