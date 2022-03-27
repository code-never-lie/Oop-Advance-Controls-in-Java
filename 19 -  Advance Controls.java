Menu

Major components in Menu

1- MenuBar
2- Menu
3- MenuItem

...................................................
Example 1 - Menu Bar with Menu 

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  MenuBar mb=new MenuBar();
  Menu file= new Menu("File");
  Menu edit= new Menu("Edit");
  Menu help= new Menu("Help");
  mb.add(file);mb.add(edit);
  mb.setHelpMenu(help);
  f.setMenuBar(mb);
  f.setSize(300,300);
  f.setBackground(Color.blue);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
................................................
Example 2- Menu Bar with Menu and Menu Items

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  MenuBar mb=new MenuBar();
  Menu file= new Menu("File");
  Menu edit= new Menu("Edit");
  Menu help= new Menu("Help");
  MenuItem open= new MenuItem("Open");
  MenuItem save= new MenuItem("save");
  MenuItem exit= new MenuItem("exit");
  MenuItem undo= new MenuItem("undo");
  MenuItem find= new MenuItem("find");
  MenuItem viewHelp= new MenuItem("viewHelp");
  file.add(open);file.add(save);file.add(exit);
  edit.add(undo);edit.add(find);
  help.add(viewHelp);
  mb.add(file);mb.add(edit);
  mb.setHelpMenu(help);
  f.setMenuBar(mb);
  f.setSize(300,300);
  f.setBackground(Color.blue);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
.................................................................
Example 3- Menu Bar with Menu, Menu Items and CheckboxMenuItem

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  MenuBar mb=new MenuBar();
  Menu file= new Menu("File");
  Menu edit= new Menu("Edit");
  Menu help= new Menu("Help");
  MenuItem open= new MenuItem("Open");
  MenuItem save= new MenuItem("save");
  CheckboxMenuItem saveOnClose=new CheckboxMenuItem("saveOnClose");
  MenuItem exit= new MenuItem("exit");
  MenuItem undo= new MenuItem("undo");
  MenuItem find= new MenuItem("find");
  MenuItem viewHelp= new MenuItem("viewHelp");
  file.add(open);file.add(save);
  file.add(saveOnClose); file.add(exit);
  edit.add(undo);edit.add(find);
  help.add(viewHelp);
  mb.add(file);mb.add(edit);
  mb.setHelpMenu(help);
  f.setMenuBar(mb);
  f.setSize(300,300);
  f.setBackground(Color.blue);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}






