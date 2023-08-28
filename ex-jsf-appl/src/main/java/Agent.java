/**
* Managed Bean.
* @author w3spoint
*/
public class Agent {
private String name;
private String agentRole;
private int agentid;
private int age;

public Agent(String name,
String agentRole, int agentid, int age) {
this.age = age;
this.name = name;
this.agentid = agentid;
this.agentRole = agentRole;
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