package ch.zhaw.gpi.twitterreview.delegates;

import java.util.Map;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named("printAdress")
public class PrintAdress implements JavaDelegate {
    @Override
    public void execute(DelegateExecution de) throws Exception {
        System.out.println("=====");
        de.setVariable("Freundin", "Franziska");
        de.setVariable("Freundin", "Lara");
        Map<String, Object> camundaVariables = de.getVariables();
        for(String key : camundaVariables.keySet()){
            System.out.println("CamundaVariables[" + key + "] = " + camundaVariables.get(key));
        }
    }
          
}
