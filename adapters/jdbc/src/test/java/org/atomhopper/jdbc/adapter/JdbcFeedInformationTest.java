package org.atomhopper.jdbc.adapter;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.atomhopper.adapter.request.adapter.GetCategoriesRequest;
import org.atomhopper.adapter.request.feed.FeedRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class JdbcFeedInformationTest {

    public static class WhenGettingPostgresFeedInformation {

        private FeedRequest feedRequest;
        private GetCategoriesRequest getCategoriesRequest;
        private JdbcFeedInformation postgresFeedInformation;

        @Before
        public void setUp() throws Exception {
            feedRequest = mock(FeedRequest.class);
            getCategoriesRequest = mock(GetCategoriesRequest.class);

            postgresFeedInformation = new JdbcFeedInformation();
        }

        @Test
        public void shouldCreatePostgresFeedInformation() throws Exception {
            assertNotNull(postgresFeedInformation);
        }

        @Test(expected=UnsupportedOperationException.class)
        public void shouldReturnId() throws Exception {
            postgresFeedInformation.getId(feedRequest);
        }

        @Test(expected=UnsupportedOperationException.class)
        public void shouldReturnCategories() throws Exception {
            postgresFeedInformation.getCategories(getCategoriesRequest);
        }
    }
}
