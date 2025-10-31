/*public class hh {
install.packages('readxl')#to install package
library('readxl')
dataset_path<-readline('enter the location of your dataset:')
data<-read.csv(dataset_path) #path
#explore data
view(data)#view the table or display it from environment
head(data)#view the first 6 rows
tail(data)#view the last 6 rows
summary(data)
class(data)
str(data)#display the structure
dim(data)#rows columns
names(data)#get columns names
#duplicates
library('dplyr')
data_clean<-distinct(data)
sum(duplicated(data_clean))
#data structure
is.integer(data_clean$rnd)
is.integer(data_clean$count)
is.integer(data_clean$total)
is.integer(data_clean$age)
is.character(data_clean$items)
is.character(data_clean$customer)
is.character(data_clean$city)
is.character(data_clean$paymentType)
#finding missing values
is.na(data_clean)
sum(is.na(data_clean))
#na.omit(data_clean) #if you insist on removing NA values
}*/
