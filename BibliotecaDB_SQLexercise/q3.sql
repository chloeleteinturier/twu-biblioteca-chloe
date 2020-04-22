SELECT title
FROM book
WHERE title NOT IN
	(SELECT title 
	FROM book
	WHERE book.id IN
		(SELECT book_id 
		 FROM checkout_item)
	);
     
     
SELECT title
FROM movie
WHERE title NOT IN
	(SELECT title 
	FROM movie
	WHERE movie.id IN
		(SELECT movie_id 
		 FROM checkout_item)
	);
    