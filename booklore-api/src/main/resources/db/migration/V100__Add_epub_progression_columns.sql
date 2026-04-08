ALTER TABLE user_book_progress
    ADD COLUMN IF NOT EXISTS epub_progress_progression FLOAT NULL;

ALTER TABLE user_book_file_progress
    ADD COLUMN IF NOT EXISTS position_progression FLOAT NULL;
