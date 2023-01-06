import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
public class HashTab
{
public static void main(String[] args)
{
HashTab prog11 = new HashTab();
HashtablehashData = prog11.readFromFile("HashTab.txt");
System.out.println("File data into Hashtable:\n"+hashData);
prog11.printTheData(hashData, "vbit");
prog11.printTheData(hashData, "123");
prog11.printTheData(hashData, "----");
}
private void printTheData(HashtablehashData, String input)
{
String output = null;
if(hashData != null)
{
Set keys = hashData.keySet();
if(keys.contains(input))

{
output = hashData.get(input);
}
else
{
Iterator iterator = keys.iterator();
while(iterator.hasNext()) {
String key = iterator.next();
String value = hashData.get(key);
if(value.equals(input))
{
output = key;
break;
} } } }
System.out.println("Input given:"+input);
if(output != null)
{
System.out.println("Data found in HashTable:"+output);
}
else {
System.out.println("Data not found in HashTable");
} }
private HashtablereadFromFile(String fileName) {
Hashtable hashData = new Hashtable();
try {
File f = new File("D:\\java\\"+fileName);
BufferedReader br = new BufferedReader(new FileReader(f));
String line = null;
while((line = br.readLine()) != null) {
String[] details = line.split("\t");
hashData.put(details[0], details[1]);
}
} catch (FileNotFoundException e) {

e.printStackTrace();
} catch (IOException e) {
e.printStackTrace(); }
return hashData; } }