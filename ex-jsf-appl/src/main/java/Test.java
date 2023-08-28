import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped; /**
* Backing bean.
* @author w3spoint
*/
@ManagedBean(name = "test")
@SessionScoped
public class Test {
private String name;
private String agentRole;
private int agentid;
private int age;
private static final List<Agent> agentlist =new ArrayList<Agent>
(Arrays.asList
		(new Agent("Brimstone","Controller",111,50),
		 new Agent("Sage","Sentinel",112,40),
		 new Agent("Reyna","Duelist",113,33),
		 new Agent("Sova","Initiator",114,38),
		 new Agent("Skye","Initiator",115,27)));

public List<Agent> getAgents(){
	
return agentlist;
}

public String addAgent(){
agentlist.add(new
Agent(name, agentRole, agentid, age));
return null;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getagentRole() {
return agentRole;
}

public void setagentRole(String agentRole) {
this.agentRole = agentRole;
}

public int getagentid() {
return agentid;
}

public void setagentid(int agentid) {
this.agentid = agentid;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}



}