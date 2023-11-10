all: HelloWorld

HelloWorld: HelloWorld.c
		gcc -o HelloWorld HelloWorld.c

clean:
		rm -f HelloWorld
