-- INSERT INTO book (id, title) VALUES (11, "The Pragmatic Programmer");
-- INSERT INTO member (id, name) VALUES (43, "Chloé Leteinturier");
-- INSERT INTO checkout_item (member_id, book_id) VALUES (43, 11);

SELECT member.name FROM member, book, checkout_item
WHERE book.id = checkout_item.book_id
AND member.id = checkout_item.member_id
AND book.title = "The Pragmatic Programmer";