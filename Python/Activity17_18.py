from optparse import Values
import pandas as pd

#create the dataset
data = {
    "usernames": ["admin", "charles","Deku"],
     "passwords": ["password", "charl13","AllMight"],
}

#Covert the dataset into a DataFrame
df = pd.DataFrame(data)

# write the dataframe to a csv file
df.to_csv("./activities/sample.csv", index=False)

#for reading aCSV file
input_data = pd.read_csv("./activities/sample.csv")

#print the values only in the usernames column
print(input_data["usernames"][1], input_data["passwords"][1])
#sort the usernames cloumn data in ascending order and print data
print(input_data.sort_values("usernames"))
print(input_data.sort_values("passwords", ascending=False))