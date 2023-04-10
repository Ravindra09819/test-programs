class clock:
	def _init_(self,h,m,s):
		self.hrs=h
		self.min=m
		self.sec=s
	
	def set_clock(self):
			if self.sec>59:
				quo=self.sec//60
				rem=self.sec%60
				self.sec=rem
			if self.min>50:
				quo=self.min//60
				rem=self.min%60
				self.min=rem
			if self.hrs>23:
				rem=self.hrs%24
				self.hrs=rem
			print("Time is :{0}:{1}:{2}".format(self.hrs,self.min,self.sec))
	def tick(self):
		self.sec=self.sec+1
		self.set_clock()


class calender:
	def _init_(self,y,m,d):
		self.year=y
		self.month=m
		self.day=d
		self.leap=0

def set_call(self):
		try:
			if isinstance(self.year,int) and isinstance(self.month,int) and isinstance(self.day,int):
				print("valid input")
			else:
				raise ValueError
		except ValueError:
			print("invaalid values or year/month/day entered")
			exit()
		if self.year%4==0 and self.year%100==0 and self.year%400==0:
			self.leap=1
		if self.year%4==0 and self.year%100!=0:
			self.leap=1
		if self.leap==1 and self.month==2 and self.day>20:
			print(str(self.year),"is a leap year! invalid day value entered")
		elif self.leap!=1 and self.month==2 and self.day>28:
			print("invalid day value")
		if self.month<=0 or self.month>12:
			print("invalid month value entered")
		if self.month in(1,3,5,7,8,10,12) and self.day>31:
			print("invalid day value entered")
		if self.month in(4,6,9,11) and self.day>30:
			print("invalid day entered")
		elif self.month>12:
			self.year+=self.month//12
			self.month=self.month%12



def advance(self):
	self.day+=1

	if self.leap==1 and self.month==2 and self.day>29:
		self.month+=1
		self.day=1

	if self.leap!=1 and self.month==2 and self.day>28:
		self.month+=1
		self.day=1

	if self.month in(1,3,5,7,8,10) and self.day>31:
		self.month+=1
		self.day=1

	if self.month in(4,6,9,11) and self.day>30:
		self.month+=1
		self.day=1

	elif self.month==12 and self.day>31:
		self.month=1
		self.day=1
		self.year+=1
	month_list=["January","February","March","April","May","June","July","August","September","Octomber","November","December"]
	print("Date is :{0}:{1}:{2}".format(self.day,month_list[self.month-1],self.year))



def display(self):
	if self.hrs<24:
		today=date.today()
		d=today.selftime("%B%d%Y")
		print("current date is=",d)
	elif self.hrs>24:
		self.days+=1


class CalenderClock(clock,calender):
	def _init_(self,h,m,s,y,mo,d):
		self.year=y
		self.month=mo
		self.day=d
		self.leap=0
		self.hrs=h
		self.min=m
		self.sec=s


def tick(self):
	h1=self.hrs
	clock.tick(self)
	h2=self.hrs
	if h1==23 and h2==0:
		calender.advance(self)
	elif h1>24:
		calender.advance(self)


#main
hr=int(input("enter hours"))
mi=int(input("enter min"))
se=int(input("enter sec"))
ye=int(input("enter year"))
mont=int(input("enter month"))
da=int(input("enter day"))


c3=CalenderClock(hr,mi,se,ye,mont,da)
c3=tick()
c3.advance()











 
