from PIL import Image
try:
	im=Image.open('code.jpg')
	print("****Image Attributes****")
	print("format of image:",im.format)
	print("Image size:",im.size)
	print(im.palette)

	im1=Image.open('code2.jpg')
	box=(250,250,600,700)
	crop_img=im1.crop(box)
	crop_img.save('crop_img.jpg')
	print(crop_img.size)
except OSError:
	print("Image not found")	
