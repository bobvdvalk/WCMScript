use("filemanager.js");
var fm = FileManager.getFileManager();

//print(FileManager.getFileManagerHandler().listFiles("F:/test"));

//var list = Java.type("java.util.List");
var list = FileManager.getFileManagerHandler().listFiles("C:/Coding/test", "dll");

for(i = 0; i < list.size(); i++) {
    print("File: "+list.get(i));
    print("Owner: "+fm.getOwner(FileManager.getPath(list.get(i))));
    print("Metadata: "+fm.readAttributes(FileManager.getPath(list.get(i)), "*"));
   // print("Data: " + FileManager.getFileManagerHandler().getBasicFileAttributes(list.get(i)).lastAccessTime());
}

//var data = FileManager.getFileManagerHandler().getBasicFileAttributes();