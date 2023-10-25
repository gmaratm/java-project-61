run-dist:
	make -C app run-dist

lint:
	make -C app lint

clean:
	make -C app clean

build:
	make -C app build

install:
	make -C app install

run:
	make -C app run

test:
	make -C app test

.PHONY: build
