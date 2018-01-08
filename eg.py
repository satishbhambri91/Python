def repeat(s, exclaim):
	""" Returns the string s repeated 3 times and if the exclaim is true, adds exclamation marks"""
	result = s*3
	if exclaim:
		result = result + '!!!'
	return result


def main():
	print repeat('Satish', True)


if __name__ == '__main__':
	main()

