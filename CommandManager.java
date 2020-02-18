/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.List;



//Command Pattern'ının manager kısmı
public class CommandManager {
    private static CommandManager instance = null;
    private QueueStack<List<Command_TextEditor>> queueStackNormal;


   

    static CommandManager getInstance(){
        if(instance != null)
            return instance;
        return new CommandManager();
    }

    private CommandManager() {
        queueStackNormal = new QueueStack<>();
        
        
    }

    void execute(List<Command_TextEditor> actionList){
        actionList.forEach(Command_TextEditor::execute);
        queueStackNormal.push(actionList);
    }




 
}
